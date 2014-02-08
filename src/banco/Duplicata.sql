--Duplicatas
SELECT
     dbcliente."txt_nomerazaosocial" AS dbcliente_txt_nomerazaosocial,
     dbcliente."num_cpfcnpj" AS dbcliente_num_cpfcnpj,
     dbcliente."num_inscricaoestatudal" AS dbcliente_num_inscricaoestatudal,
     dbcliente."txt_endereco" AS dbcliente_txt_endereco,
     dbcliente."txt_bairrodistrito" AS dbcliente_txt_bairrodistrito,
     dbcliente."num_numero" AS dbcliente_num_numero,
     dbcliente."num_cep" AS dbcliente_num_cep,
     dbcliente."txt_cidade" AS dbcliente_txt_cidade,
     dbestado."txt_nome_estado" AS dbestado_txt_nome_estado,
     dbcliente."num_telefone" AS dbcliente_num_telefone,
     dbcliente."num_celular1" AS dbcliente_num_celular1
FROM
     "public"."dbestado" dbestado INNER JOIN "public"."dbcliente" dbcliente ON dbestado."id_cod_estado" = dbcliente."id_cod_estado"