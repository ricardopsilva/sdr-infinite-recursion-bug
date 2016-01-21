insert into book (id, name) values ( 1, 'A Software Tale');

insert into page (id, number, book_id) values ( 1, 10, (select id from book where name='A Software Tale'));
insert into page (id, number, book_id) values ( 2, 11, (select id from book where name='A Software Tale'));
insert into page (id, number, book_id) values ( 3, 12, (select id from book where name='A Software Tale'));
insert into page (id, number, book_id) values ( 4, 13, (select id from book where name='A Software Tale'));
insert into page (id, number, book_id) values ( 5, 14, (select id from book where name='A Software Tale'));
insert into page (id, number, book_id) values ( 6, 15, (select id from book where name='A Software Tale'));