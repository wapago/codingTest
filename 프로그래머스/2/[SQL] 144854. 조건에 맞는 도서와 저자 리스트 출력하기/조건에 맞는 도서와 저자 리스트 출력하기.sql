-- 코드를 입력하세요
SELECT b.BOOK_ID, a.AUTHOR_NAME, DATE_FORMAT(PUBLISHED_DATE, '%Y-%m-%d') as PUBLISHED_DATE
FROM book as b 
inner join author as a 
on b.author_id = a.author_id
WHERE b.CATEGORY = "경제"
order by b.PUBLISHED_DATE;