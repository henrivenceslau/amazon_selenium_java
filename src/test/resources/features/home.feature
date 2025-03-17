#language : pt

Funcionalidade: Testes da Home

Contexto:
		Dado que eu acesse o site da Amazon

	
Esquema do Cenário: Validar sugestoes de pesquisa na home da Amazon
		Quando digito "<produto>" na barra de pesquisa
		Entao valido se as sugestoes de pesquisa exibem as opcoes "<sugestoes>"
		
		Exemplos:
		| produto | sugestoes										     |
		| celular | celular samsung ; celular barato |
		| maquina | fotografica   					  	     |