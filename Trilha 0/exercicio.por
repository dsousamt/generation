programa
{	
	
	funcao inicio()
	{

	// Exercício 01
		inteiro i, j, temp, vet[] = {2,5,1,3,4,9,7,8,10,6}

		// ordena array
		para(j = 0; j < 10; j++) {
			para(i = 0; i < 10 - 1; i++){
				se (vet[i] < vet[i + 1]){
					temp = vet[i]
					vet[i] = vet[i + 1]
					vet[i + 1] = temp
			}
		}
		}

		escreva("Ordenação decrescente do primeiro vetor: ")
		para(i = 0; i < 10; i++){
			escreva(vet[i] + ", ")
		}

	// Exercício 02
		inteiro vet2[10], soma = 0
		real media

		// Armazena no Array

		para(i = 0; i < 10; i++){
			escreva("\nDigite o número " + i + " : ")
			leia(vet2[i])
		}

		// Elementos de índices ímpares
		escreva("\nElementos com índices ímpares: ")
		para(i = 0; i < 10; i++){

			se (i % 2 == 1) {
				escreva(vet2[i] + ", ")				
			}
		}

		// Elementos pares
		escreva("\nElementos pares: ")
		para(i = 0; i < 10; i++){

			se (vet2[i] % 2 == 0) {
				escreva(vet2[i] + ", ")				
			}
		}

		// Soma
		escreva("\nSoma: ")
		para(i = 0; i < 10; i++){
			soma = soma + vet2[i]
		}
		escreva(soma)

		// Média
		escreva("\nMédia: ")
		media = soma / 10
		escreva(media)
		
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 128; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */