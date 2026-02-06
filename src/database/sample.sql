#[1] 데이터베이스 생성 
drop database if exists boardservice7;
create database boardservice7;
use boardservice7;
#[2] 테이블 생성 
create table board(
	bno int auto_increment , 
	constraint primary key( bno ),
    bcontent longtext not null , 
    bwriter varchar(30) not null ,
    bdate datetime default now()
);
 
#[3] 테이블 샘플데이터

insert into board (bcontent, bwriter)
values ('첫 번째 게시글입니다. 게시판 테스트용 내용입니다.', '홍길동');
insert into board (bcontent, bwriter)
values ('두 번째 게시글입니다. MySQL 연습 중입니다.', '김철수');
insert into board (bcontent, bwriter)
values ('세 번째 게시글입니다. longtext 타입 테스트를 위한 내용입니다.', '이영희');
insert into board (bcontent, bwriter)
values ('네 번째 게시글입니다. 날짜는 자동으로 들어갑니다.', '관리자');

#