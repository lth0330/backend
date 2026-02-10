drop database if exists project2;
create database project2;
use project2;

create table product(
	bno int auto_increment,
    constraint primary key(bno),
    bnickname varchar(20)not null,
    bitem varchar(20) not null,
    bexplain longtext,
    bprice int not null,
    bpw int not null,
    bphone varchar(13),
    bsale varchar(4) default "판매중",
    bdate datetime default now()
);

INSERT INTO product 
(bnickname, bitem, bexplain, bprice, bpw, bphone, bsale, bdate)
VALUES
('철수', '아이폰12', '생활기스 약간 있으나 사용에 문제 없습니다.', 450000, 1234, '010-1111-1111', '판매중', NOW()),
('영희', '갤럭시S21', '박스 풀세트, 거의 새 제품입니다.', 520000, 2345, '010-2222-2222', '판매중', NOW()),
('민수', '에어팟프로', '왼쪽 유닛 사용감 있습니다.', 180000, 3456, '010-3333-3333', '판매중', NOW()),
('지훈', '아이패드', '인강용으로 사용, 필기 흔적 있음.', 600000, 4567, '010-4444-4444', '판매완료', NOW()),
('수진', '노트북', '사무용으로 적합, 배터리 양호.', 750000, 5678, '010-5555-5555', '판매중', NOW()),
('현우', '키보드', '기계식 키보드, 청축입니다.', 70000, 6789, '010-6666-6666', '판매중', NOW()),
('유나', '마우스', '게이밍 마우스, DPI 조절 가능.', 35000, 7890, '010-7777-7777', '판매중', NOW()),
('동현', '모니터', '27인치 FHD 모니터, 무결점.', 190000, 8901, '010-8888-8888', '판매완료', NOW()),
('서연', '책상', '원목 책상, 직접 가져가셔야 합니다.', 120000, 9012, '010-9999-9999', '판매중', NOW()),
('재훈', '의자', '사무용 의자, 높낮이 조절 가능.', 80000, 1122, '010-0000-0000', '판매중', NOW());

select * from product;