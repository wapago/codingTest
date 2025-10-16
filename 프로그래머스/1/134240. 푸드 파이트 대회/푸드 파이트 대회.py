def solution(food):
    first_half = ""
    second_half = ""
    
    for i in range(1, len(food)):
        if food[i] >= 2:
            first_half += str(i) * (food[i] // 2)
            
    print(first_half)
    
    for i in range(len(first_half)-1, -1, -1):
        second_half += first_half[i]
        
    print(second_half)        
        
    answer = first_half + "0" + second_half
    
    print(answer)
    
    return answer