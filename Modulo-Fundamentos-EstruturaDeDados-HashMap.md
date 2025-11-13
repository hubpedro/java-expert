### 🧠 Conceitos Teóricos

#### O que é HashMap?

HashMap é uma **estrutura que armazena pares chave-valor**. Pense em um dicionário telefônico:

```
Chave: Nome da Pessoa  |  Valor: Número de Telefone
"João"                 |  "98765-4321"
"Maria"                |  "91234-5678"
"Pedro"                |  "99999-8888"
```

**Características principais:**

- ✅ Busca muito rápida por chave O(1)
- ✅ Não mantém ordem de inserção
- ✅ A chave deve ser **única**
- ✅ O valor pode ser **duplicado**
- ✅ Permite uma chave **null** e múltiplos valores **null**
- ❌ Não é thread-safe (existe ConcurrentHashMap para isso)

**Analogia:** Se ArrayList é uma **fila numerada**, HashMap é um **guichê onde você diz o CPF e recebe o documento
correspondente**.

#### Casos de uso reais:

- Cache de dados (usuário_id → dados_do_usuário)
- Configurações de aplicação (chave_config → valor_config)
- Índices de banco de dados
- Mapa de frequência de palavras
- Mapeamento de ID → Objeto

---

### 💪 EXERCÍCIOS - HashMap (20 exercícios)

#### Nível Básico (1-7)

**Exercício 1: Criar e Adicionar**

Crie um HashMap que mapeie nomes para idades. Adicione 5 pessoas: João (25), Maria (30), Pedro (22), Ana (28), Carlos (
35).

O que você está praticando: put(), sintaxe HashMap Questão: Qual é a diferença entre HashMap<String, Integer> e HashMap<
Integer, String>?

---

**Exercício 2: Acessar Valor pela Chave**

> Usando o HashMap do exercício anterior, recupere e imprima a idade de "Maria" usando `get()`.
> O que você está praticando: `get(chave)` Cuidado: O que `get()` retorna se a chave não existir?

---

**Exercício 3: Verificar se Chave Existe**

Usando o mesmo HashMap, verifique se a chave "Pedro" existe usando `containsKey()`.
O que você está praticando: `containsKey()` Questão: Como é diferente de `containsValue()`?

---

**Exercício 4: Verificar se Valor Existe**

Usando o HashMap, verifique se existe alguém com idade 28 usando containsValue().
O que você está praticando: containsValue() Pense: Por que buscar por valor é mais lento que por chave?

---

**Exercício 5: Remover um Elemento**

> Crie um HashMap com 3 frutas e seus preços. Remova uma fruta usando `remove()`.
> O que você está praticando: `remove(chave)` Questão: O que `remove()` retorna?

---

**Exercício 6: Obter Tamanho**

> Crie um HashMap vazio, adicione 7 elementos, e imprima o tamanho usando `size()`.
> O que você está praticando: `size()` Diferença: HashMap não tem índices, por que `size()` ainda é útil?

---

**Exercício 7: Limpar HashMap**

> Crie um HashMap, adicione alguns elementos, imprima o tamanho, limpe com `clear()`, e imprima novamente.
> O que você está praticando: `clear()` Questão: Qual será o tamanho após `clear()`?

---

#### Nível Intermediário (8-14)

**Exercício 8: Iterar sobre Chaves**

> Crie um HashMap com capitais: "Brasil" → "Brasília", "França" → "Paris", "Japão" → "Tóquio". Imprima todas as chaves
> usando `keySet()`.
> O que você está praticando: `keySet()`, iteração Dica: Use `for (String chave : mapa.keySet())`

---

**Exercício 9: Iterar sobre Valores**

> Usando o HashMap de capitais, imprima todos os valores usando `values()`.
> O que você está praticando: `values()` Questão: Os valores têm alguma ordem garantida?

---

**Exercício 10: Iterar sobre Pares (Chave-Valor)**

> Usando o HashMap de capitais, imprima cada par no formato "País: Capital" usando `entrySet()`.
> O que você está praticando: `entrySet()`, `entry.getKey()`, `entry.getValue()` Melhor prática: Por que `entrySet()` é
> mais eficiente que `keySet()` quando você precisa de ambos?

---

**Exercício 11: Atualizar Valor Existente**

> Crie um HashMap com preços: "Notebook" → 3000, "Mouse" → 50, "Teclado" → 200. O notebook caiu de preço, atualize para
> 2500 usando `put()`.
> O que você está praticando: `put()` para atualização Questão: O que `put()` retorna quando atualizamos uma chave
> existente?

---

**Exercício 12: Obter ou Usar Default**

> Crie um HashMap com 3 linguagens e suas versões. Tente obter uma linguagem que não existe usando `getOrDefault()`.
> O que você está praticando: `getOrDefault(chave, valor_padrao)` Caso de uso: Por que é útil ao invés de apenas
> verificar `if (map.containsKey())`?

---

**Exercício 13: HashMap com Valores que são Listas**

> Crie um HashMap onde a chave é uma categoria e o valor é uma ArrayList de produtos. Ex: "
> Eletrônicos" → ["TV", "Notebook"], "Roupas" → ["Camiseta", "Calça"].
> O que você está praticando: Estruturas aninhadas Desafio: Como você adicionaria um novo produto à categoria "
> Eletrônicos"?

---

**Exercício 14: Contar Frequência de Elementos**

> Receba uma string com palavras separadas por espaço. Use um HashMap para contar quantas vezes cada palavra aparece.
> Ex: "java java python java" → {java=3, python=1}
> O que você está praticando: HashMap para análise de dados Dica: Para cada palavra, verifique se já existe no mapa e
> incremente

---

#### Nível Avançado (15-20)

**Exercício 15: Trocar Chaves e Valores**

> Crie um HashMap com código_pais → nome_pais. Crie um novo HashMap invertido com nome_pais → código_pais.
> O que você está praticando: Transformação de dados Questão: O que aconteria se houvesse países com nomes duplicados?

---

**Exercício 16: Mesclar Dois HashMaps**

> Crie dois HashMaps de alunos: Map1 com notas do 1º semestre, Map2 com notas do 2º semestre. Mescle os dois em um único
> HashMap.
> O que você está praticando: `putAll()` Questão: Se um aluno aparecer nos dois mapas, o que acontece?

---

**Exercício 17: Encontrar Chave pelo Valor**

> Crie um HashMap com ID → Nome. Encontre o ID de uma pessoa procurando pelo nome. (Dica: Itere sobre `entrySet()`)
> O que você está praticando: Busca invertida Pense: Por que HashMap não tem um método direto `getKeyByValue()`?

---

**Exercício 18: Remover Elementos com Condição**

> Crie um HashMap com nomes e idades. Remova todas as pessoas menores de 18 usando `removeIf()`.
> O que você está praticando: `removeIf()` com predicados Avançado: Use uma lambda expression para a condição

---

**Exercício 19: HashMap com Tipos Complexos - Simulação de Banco de Dados**

> Crie uma classe `Usuario` com `id`, `nome`, `email`. Crie um HashMap que mapeie `Long id → Usuario`. Adicione 3
> usuários e recupere pelo ID.
> O que você está praticando: HashMap com objetos customizados Desafio: Implemente uma função que procure por email

---

**Exercício 20: Implementar um Contador de Dígitos**

> Receba um número inteiro. Use um HashMap para contar quantas vezes cada dígito aparece. Ex: 112233 → {1=2, 2=2, 3=2}
> O que você está praticando: Análise de dados com HashMap Dica: Converta o número para String, depois para array de
> caracteres
---
