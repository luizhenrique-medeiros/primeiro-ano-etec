SELECT * FROM tb01_fornecedor WHERE tb01_nome LIKE 'm%' AND tb01_email LIKE '%gmail%';
SELECT * FROM tb01_fornecedor WHERE tb01_email IS NULL;
SELECT * FROM tb02_produto WHERE tb02_descricao LIKE 'grama%';
SELECT * FROM tb03_clientes WHERE tb03_uf LIKE 'sp%' AND YEAR (tb03_dt_cadastra) = 2022;
SELECT COUNT(*) FROM tb03_clientes GROUP BY YEAR(tb03_dt_cadastra);
SELECT * FROM tb03_clientes WHERE tb03_valor = (SELECT MIN(tb03_valor) FROM tb03_clientes);
SELECT AVG(tb03_valor) FROM tb03_clientes GROUP BY tb03_tipo;
SELECT SUM(tb03_valor) FROM tb03_clientes WHERE tb03_valor >2000 AND tb03_valor <6000;

