SELECT * FROM tb04_voo WHERE YEAR (tb04_dt_decolagem) = 2024 AND MONTH (tb04_dt_decolagem) = 1;
SELECT * FROM tb04_voo WHERE tb04_cod_decolagem = 25;
SELECT * FROM tb02_aeroporto WHERE tb02_pais = 'brasil';
SELECT * FROM tb01_aeronave WHERE tb01_capacidade_max <= 300;
SELECT * FROM tb04_voo WHERE tb04_cod_aterrisagem = 25 AND YEAR (tb04_dt_aterrisagem) = 2005;
SELECT * FROM tb04_voo WHERE YEAR (tb04_dt_decolagem) = 2024;
SELECT * FROM tb04_voo WHERE DAY (tb04_dt_decolagem) = 20;
SELECT * FROM tb04_voo WHERE MONTH(tb04_dt_decolagem) = 06;
SELECT AVG (tb01_capacidade_max) FROM tb01_aeronave;

