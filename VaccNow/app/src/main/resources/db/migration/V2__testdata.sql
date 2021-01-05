INSERT INTO branch(id, name, capacity) VALUES(101, 'ABC', 10);
INSERT INTO branch(id, name, capacity) VALUES(102, 'CDE', 11);
INSERT INTO branch(id, name, capacity) VALUES(103, 'DBC', 12);
INSERT INTO branch(id, name, capacity) VALUES(104, 'REW', 13);

INSERT INTO vaccine(id, name, price) VALUES(1, 'Q', 100.00);
INSERT INTO vaccine(id, name, price) VALUES(2, 'P', 112.00);
INSERT INTO vaccine(id, name, price) VALUES(3, 'W', 108.00);
INSERT INTO vaccine(id, name, price) VALUES(4, 'R', 144.00);
INSERT INTO vaccine(id, name, price) VALUES(5, 'T', 166.00);

INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(101,1);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(102,2);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(103,3);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(104,4);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(101,5);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(102,5);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(103,1);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(104,2);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(101,3);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(102,4);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(103,5);
INSERT INTO branch_vaccine(branch_id, vaccine_id) VALUES(104,2);

INSERT INTO timeslot(id, branch_id, slot) VALUES(1, 101, '11:00');
INSERT INTO timeslot(id, branch_id, slot) VALUES(2, 102, '11:00');
INSERT INTO timeslot(id, branch_id, slot) VALUES(3, 103, '11:00');
INSERT INTO timeslot(id, branch_id, slot) VALUES(4, 104, '11:00');
INSERT INTO timeslot(id, branch_id, slot) VALUES(5, 104, '11:30');
INSERT INTO timeslot(id, branch_id, slot) VALUES(6, 101, '11:30');
INSERT INTO timeslot(id, branch_id, slot) VALUES(7, 102, '12:00');
INSERT INTO timeslot(id, branch_id, slot) VALUES(8, 103, '12:00');



