SELECT COUNT(*) FROM tb05_login WHERE tb05_nome LIKE  's%' ;
SELECT SUM(tb03_valor) FROM tb03_pedidos GROUP BY YEAR (tb03_data) = 2022;
SELECT * FROM tb03_pedidos WHERE tb03_id_cliente = 17 AND MONTH(tb03_data) = 02 AND YEAR (tb03_data) = 2024;                                                                                                                                                                                            
SELECT * FROM tb03_pedidos WHERE tb03_id_cliente = 5 AND tb03_valor > 10;
