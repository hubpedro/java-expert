### 🎯 Objetivo desta sessão

Você vai dominar as 3 estruturas de dados mais usadas em produção: **List**, **Map** e **Set**. Não é sobre decorar
APIs, é sobre entender **quando** e **por que** usar cada uma.

---

### 🧠 Conceitos Teóricos

#### O que é ArrayList?

ArrayList é uma **implementação de List que usa um array interno**. Pense assim:

```
Inicialmente: [null, null, null, null, null]
Depois de add: ["Java", "Python", null, null, null]
Se cresce: ["Java", "Python", "Go", "Rust", "C++", null, null...]
```

**Características principais:**

- ✅ Acesso rápido por índice (O(1))
- ✅ Inserção/remoção no final é rápida O(1)
- ❌ Inserção/remoção no meio é lenta O(n) - precisa realocar
- ✅ Mantém ordem de inserção
- ✅ Permite duplicados
- ✅ Permite null

**Analogia:** Pense em um ArrayList como uma **fila de espera do banco**. Se alguém chega no final, é rápido adicionar.
Mas se alguém sai do meio, todos à frente precisam avançar uma posição.

#### Casos de uso reais:

- Carrinho de compras (adiciona/remove produtos no final)
- Histórico de transações
- Feed de redes sociais
- Resultados de busca

---

### 💪 EXERCÍCIOS - ArrayList (20 exercícios)

#### Nível Básico (1-7)

**Exercício 1: Criar e Listar**

> Crie uma ArrayList de Strings com 5 frutas (maçã, banana, laranja, uva, melancia). Depois imprima cada uma em uma
> linha separada usando um for.
>
> O que você está praticando: `add()`, `get()`, iteração Dica: Use `.size()` para saber quantos elementos tem

---

**Exercício 2: Adicionar Dinamicamente**

> Crie um ArrayList vazio. Peça ao usuário para digitar 5 nomes de cidades. Adicione cada uma à lista. Por fim, imprima
> todas as cidades adicionadas.
>
> O que você está praticando: Entrada do usuário, `add()` Desafio: Use um loop para ler 5 vezes em vez de escrever 5
> vezes

---

**Exercício 3: Verificar Existência**

> Crie uma ArrayList com 10 números inteiros (1-10). Peça ao usuário para digitar um número. Verifique se esse número
> existe na lista usando `contains()`.

> O que você está praticando: `contains()`, condicionais Pense: O que `contains()` retorna? true ou false?

---

**Exercício 4: Contar Elementos**

> Crie uma ArrayList com os números: 5, 10, 15, 20, 25. Imprima o tamanho dela usando `size()`.
>
> O que você está praticando: `size()` Questão: Como isso é diferente de um array tradicional?

---

**Exercício 5: Acessar por Índice**

> Crie uma ArrayList com ["JavaScript", "Python", "Java", "Go"]. Acesse e imprima o 1º, 2º, 3º e 4º elemento usando
`get()`.
>
> O que você está praticando: `get()`, índices (começam em 0) Cuidado: Qual é o índice do primeiro elemento? 0 ou 1?

---

**Exercício 6: Remover Elemento**

> Crie uma ArrayList com cores: ["vermelho", "azul", "verde", "amarelo"]. Remova a cor "azul" usando `remove()`.
>
> O que você está praticando: `remove()` Questão: Qual é mais seguro: remover por índice ou por valor?

---

**Exercício 7: Limpar Tudo**

> Crie uma ArrayList, adicione 3 números, imprima o tamanho, depois limpe tudo com `clear()` e imprima novamente.
>
> O que você está praticando: `clear()`, `size()` Pense: Qual é o tamanho depois de `clear()`?

---

#### Nível Intermediário (8-14)

**Exercício 8: Buscar Elemento e Sua Posição**

Crie uma ArrayList com "Ana", "Bruno", "Carlos", "Diana". Encontre em qual posição está "Carlos" usando indexOf().

O que você está praticando: indexOf() Questão: O que indexOf() retorna se não encontrar o elemento?

---

**Exercício 9: Modificar Elemento Existente**

> Crie uma ArrayList com [10, 20, 30, 40]. Altere o valor 30 para 35 usando `set()`. Imprima a lista antes e depois.
>
> O que você está praticando: `set(índice, novo_valor)` Diferença: `set()` substitui, enquanto `add()` insere

---

**Exercício 10: Sublist (Parte de uma Lista)**

> Crie uma ArrayList com números 1 a 10. Extraia os elementos do índice 2 ao 5 usando `subList()`.
> O que você está praticando: `subList(inicio, fim)` Atenção: O parâmetro `fim` é inclusivo ou exclusivo?

---

**Exercício 11: Verificar se Está Vazia**

> Crie uma ArrayList vazia. Verifique se está vazia usando `isEmpty()`. Adicione um elemento e verifique novamente.
>
> O que você está praticando: `isEmpty()` Boas práticas: Por que é importante verificar se está vazia antes de acessar?

---

**Exercício 12: Remover Todos os Elementos que Correspondem a uma Condição**

> Crie uma ArrayList com ["maçã", "banana", "amora", "blueberry"]. Remova todas as frutas que começam com "b" usando
`removeIf()`.
>
> O que você está praticando: `removeIf()`, lambda expression Desafio: Como você verificaria se uma string começa com
> uma letra?

---

**Exercício 13: ArrayList com Objetos**

> Crie uma classe `Pessoa` com atributos `nome` e `idade`. Crie uma ArrayList de Pessoas, adicione 3 pessoas diferentes,
> e imprima suas informações.
>
> O que você está praticando: ArrayList com tipos personalizados Importante: ArrayList<String> é diferente de
> ArrayList<Pessoa>? Como?

---

**Exercício 14: Inverter a Ordem**

> Crie uma ArrayList com [1, 2, 3, 4, 5]. Inverta a ordem usando `Collections.reverse()`. Imprima antes e depois.
>
> O que você está praticando: `Collections.reverse()` Questão: O que `Collections` faz? É diferente de `Collection`?

---

#### Nível Avançado (15-20)

**Exercício 15: Ordenar ArrayList**

> Crie uma ArrayList com números desordenados: [15, 3, 42, 7, 1]. Ordene-a usando `Collections.sort()`. Imprima antes e
> depois.
>
> O que você está praticando: `Collections.sort()` Desafio: Como você ordenaria em ordem decrescente?

---

**Exercício 16: ArrayList com Duplicados - Remover Duplicatas**

> Crie uma ArrayList: ["maçã", "banana", "maçã", "laranja", "banana"]. Remova as duplicatas convertendo para HashSet e
> depois voltando para ArrayList.
>
> O que você está praticando: Conversão entre estruturas Questão: Por que um HashSet não permite duplicados?

---

**Exercício 17: Buscar Todos os Índices de um Elemento**

> Crie uma ArrayList: [1, 2, 1, 3, 1, 4]. Encontre TODOS os índices onde o número 1 aparece.
>
> O que você está praticando: Lógica com loops e `indexOf()` Dica: Use um loop e comece a busca após encontrar um

---

**Exercício 18: Inserir no Meio da Lista**

> Crie uma ArrayList: ["A", "B", "D"]. Insira "C" na posição 2 usando `add(índice, elemento)`.
>
> O que você está praticando: `add(índice, elemento)` Observe: Como isso difere de `set()`? Qual desloca elementos?

---

**Exercício 19: Encontrar Elemento Máximo e Mínimo**

> Crie uma ArrayList com [45, 12, 78, 3, 99, 22]. Use `Collections.max()` e `Collections.min()` para encontrar o maior e
> menor.
>
> O que você está praticando: `Collections.max()`, `Collections.min()` Questão: O que acontece se a lista estiver vazia?

---

**Exercício 20: ArrayList com Tipos Genéricos - Simulação de Carrinho de Compras**

> Crie uma classe `Produto` com `nome` e `preço`. Crie uma ArrayList, adicione 5 produtos. Calcule o preço total e
> mostre a quantidade de itens.
>
> O que você está praticando: Integração de conceitos Desafio: Remova um produto e recalcule o total

---

---


---


---

#