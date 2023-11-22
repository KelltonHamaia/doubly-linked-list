
# Documentação da Lista Duplamente Encadeada

A classe `DoublyLinkedList` representa uma lista duplamente encadeada que armazena elementos do tipo `Node`. Cada nó contém um valor sequencial e é conectado aos nós anterior e posterior na lista.

## Métodos

### add(Node node)

Adiciona um valor sequencial à lista.

### addFirst(Node node)

Adiciona um valor no início (head) da lista.

### addLast(Node node)

Insere um valor no final (tail) da lista.

### addAfter(String target, Node node)

Insere um valor após o nó identificado pelo alvo especificado.

### removeFirst()

Remove o primeiro nó (head) da lista.

### removeLast()

Remove o último nó (tail) da lista.

### remove(Node node)

Remove um nó específico da lista.

### removeByData(String target)

Remove o nó cujo valor de dados corresponde ao parâmetro de destino.

### showListInOrder()

Exibe a lista do início (head) ao final (tail).

### showListInOrderReverse()

Exibe a lista do final (tail) ao início (head).

### size() : int

Retorna o tamanho da lista.

### isEmpty() : boolean

Retorna verdadeiro se a lista estiver vazia; falso, caso contrário.

### showHead()

Mostra o valor do primeiro nó (head) da lista.

### showTail()

Mostra o valor do último nó (tail) da lista.

### search(String data) : boolean

Verifica se o valor especificado existe na lista.

**Observação**: Os métodos `showListInOrder`, `showListInOrderReverse`, `size`, `isEmpty`, `showHead`, `showTail`, e `search` são métodos de consulta que não modificam a estrutura da lista.
