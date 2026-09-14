# Cálculo de Valor Total de Pedido

Desafio Java (Spring) para calcular o valor total de um pedido, aplicando desconto percentual sobre o valor básico e somando o frete conforme faixa de valor.

## Regras

- **Desconto:** aplicado em cima do valor básico do pedido.
- **Frete:**

| Valor básico do pedido       | Frete     |
|-------------------------------|-----------|
| Abaixo de R$ 100,00            | R$ 20,00  |
| De R$ 100,00 até R$ 200,00 (exclusive) | R$ 12,00  |
| R$ 200,00 ou mais              | Grátis    |

## Exemplo

**Entrada:** código 1309, valor básico R$ 95,90, desconto 0%

**Saída:**
```
Pedido código 1309
Valor total: R$ 115.90
```

## Estrutura do projeto

```
src/main/java
├── entities
│   └── Order.java
└── services
    ├── OrderService.java
    └── ShippingService.java
```

- `Order`: entidade com código, valor básico e percentual de desconto.
- `ShippingService`: calcula o valor do frete de acordo com a faixa do valor básico.
- `OrderService`: calcula o valor total do pedido (valor com desconto + frete), usando `ShippingService` via injeção de dependência.

## Tecnologias

- Java
- Spring Boot (injeção de dependência com `@Service` / `@Autowired`)

## Como executar

O projeto usa `CommandLineRunner` para rodar um exemplo automaticamente ao iniciar a aplicação, exibindo o código do pedido e o valor total calculado no console.
