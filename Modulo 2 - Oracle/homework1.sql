CREATE USER HOMEWORK1 IDENTIFIED BY oracle;
GRANT CONNECT TO HOMEWORK1;
GRANT CONNECT, RESOURCE, DBA TO HOMEWORK1;
GRANT CREATE SESSION TO HOMEWORK1;
GRANT DBA TO HOMEWORK1;
GRANT CREATE VIEW, CREATE PROCEDURE, CREATE SEQUENCE to HOMEWORK1;
GRANT UNLIMITED TABLESPACE TO HOMEWORK1;
GRANT CREATE MATERIALIZED VIEW TO HOMEWORK1;
GRANT CREATE TABLE TO HOMEWORK1;
GRANT GLOBAL QUERY REWRITE TO HOMEWORK1;
GRANT SELECT ANY TABLE TO HOMEWORK1;


CREATE TABLE HOMEWORK1.ESTUDANTE (
	id NUMBER NOT NULL,
	nome VARCHAR2(200) NOT NULL,
	data_nascimento DATE NOT NULL,
	nr_matricula NUMBER(10) UNIQUE NOT NULL,
	ativo CHAR, -- ('S'= ativo, 'N' = não ativo)
	PRIMARY KEY(id)
);

CREATE SEQUENCE HOMEWORK1.seq_estudante
START WITH 1
INCREMENT BY 1
NOCACHE NOCYCLE;

DROP TABLE HOMEWORK1.ESTUDANTE;

DROP SEQUENCE HOMEWORK1.seq_estudante;


SELECT * FROM ESTUDANTE;


INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Luiz Souza', TO_DATE('12-12-2002', 'dd-mm-yyyy'), 0000000001, 'S');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Roberto', TO_DATE('13-12-2002', 'dd-mm-yyyy'), 0000000002, 'N');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'João', TO_DATE('14-12-2002', 'dd-mm-yyyy'), 0000000003, 'S');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Lucio', TO_DATE('15-12-2002', 'dd-mm-yyyy'), 0000000004, 'N');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Rafael', TO_DATE('16-12-2002', 'dd-mm-yyyy'), 0000000005, 'S');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Gabriel', TO_DATE('17-12-2002', 'dd-mm-yyyy'), 0000000006, 'N');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Guilherme', TO_DATE('18-12-2002', 'dd-mm-yyyy'), 0000000007, 'S');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Pedro', TO_DATE('19-12-2002', 'dd-mm-yyyy'), 0000000008, 'N');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Matheus', TO_DATE('20-12-2002', 'dd-mm-yyyy'), 0000000009, 'S');
INSERT INTO ESTUDANTE (id, NOME, DATA_NASCIMENTO, NR_MATRICULA, ATIVO) VALUES (seq_estudante.nextval, 'Alisson', TO_DATE('21-12-2002', 'dd-mm-yyyy'), 0000000010, 'N');

