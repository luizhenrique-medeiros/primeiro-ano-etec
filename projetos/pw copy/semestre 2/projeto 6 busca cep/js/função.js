
        function buscaCEP() {
            var valor = document.getElementById("nro").value;
            var cep = valor.replace(/\D/g, '');

            if (cep != "") {
                var validacep = /^[0-9]{8}$/;
                if (validacep.test(cep)) {
                    var script = document.createElement('script');
                    script.src = 'https://viacep.com.br/ws/'+ cep + '/json/?callback=meu_callback';
                    document.body.appendChild(script);
                } else {
                    alert("Formato de CEP inválido.");
                    limpaCEP();
                }
            } else {
                alert("Digite um CEP.");
                limpaCEP();
            }
        }

        function meu_callback(conteudo) {
            if (!("erro" in conteudo)) {
                document.getElementById('rua').innerHTML = conteudo.logradouro || '-';
                document.getElementById('bairro').innerHTML = conteudo.bairro || '-';
                document.getElementById('cidade').innerHTML = conteudo.localidade || '-';
                document.getElementById('uf').innerHTML = conteudo.uf || '-';
            } else {
                alert("CEP não encontrado.");
                limpaCEP();
            }
        }

        function limpaCEP() {
            document.getElementById('rua').innerHTML = '-';
            document.getElementById('bairro').innerHTML = '-';
            document.getElementById('cidade').innerHTML = '-';
            document.getElementById('uf').innerHTML = '-';
        }
  