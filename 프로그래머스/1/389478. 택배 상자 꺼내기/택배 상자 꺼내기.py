def solution(n, w, num):
    row_count = (n//w) if (n/w) == (n//w) else (n//w) + 1
    target_row = (num//w) if (num/w) == (num//w) else (num//w) + 1
        
    target_row_start = (w * target_row) if target_row % 2 == 0 else (w * target_row) - (w - 1)
    target_row_last = target_row_start - (w-1) if target_row % 2 == 0 else target_row_start + (w-1)
    
    target_array = []
    
    if target_row % 2 == 0:
        for i in range(w):
            target_array.append(target_row_start - i)
            if target_array[i] == num:
                target_idx = i
    else:
        for i in range(w):
            target_array.append(target_row_start + i)
            if target_array[i] == num:
                target_idx = i
    
    last_row_min = w * (row_count - 1) + 1
    
    last_array = []
    
    for i in range(last_row_min, n+1):
        last_array.append(i)    
        
    if row_count % 2 == 0:
        last_array = sorted(last_array, reverse=True)
        for i in range(w - len(last_array)):
            last_array.insert(0, 0)
    else:
        for i in range(w - len(last_array)):
            last_array.append(0)
        
    if last_array[target_idx]:
        return row_count - target_row + 1
    else:
        return row_count - target_row
