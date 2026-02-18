# Desafio: Geração de Bootcamp com POO Avançado e Java Streams

Este projeto simula o ecossistema de um Bootcamp de tecnologia. O objetivo principal é aplicar os pilares da Programação Orientada a Objetos (POO) de forma moderna, utilizando recursos de alta performance do Java para manipulação de dados e regras de negócio.

---

## 🛑 Pré-Requisitos

* ✅ Conhecer a sintaxe do Java
* ✅ Java JDK 17
* ✅ IDE para desenvolvimento Java (IntelliJ recomendado)
* ✅ Git

---

## 👣 Passo-a-Passo

1. **Abstrair** o domínio Bootcamp e modelar seus atributos e métodos.
2. **Criar as classes**: Bootcamp, Cursos, Mentorias e Devs e relacioná-las.
3. **Modelar** as classes específicas com seus atributos e métodos.
4. **Aplicar os pilares POO**: Abstração, Encapsulamento, Herança e Polimorfismo.
5. **Instanciar** as classes para transformá-las em objetos funcionais.
6. Refatorar usando clean code

---

## 🚀 Diferenciais de Implementação (Performance & Clean Code)

Diferente de uma implementação básica, este projeto foca em **eficiência e segurança de dados**:

* **Java Streams API:** O cálculo de XP total (método `calcularTotalXp`) para processamento com Streams, deixando o código mais conciso e performático.
* **Gestão de Fluxo com Optional:** Implementação do `Optional` no método de progressão, garantindo que o sistema trate a ausência de conteúdos inscritos de forma segura, evitando erros de execução (*NullPointerException*).
* **Collections:** Utilização de `LinkedHashSet` para garantir que um Dev não se inscreva em conteúdos duplicados, mantendo ao mesmo tempo a ordem cronológica de inscrição.
* **Imutabilidade e Construtores:** Objetos como `Curso` e `Mentoria` são instanciados com estados válidos através de construtores parametrizados, garantindo a integridade dos dados desde o nascimento do objeto.

---

## 📚 Os 4 Pilares do POO

| Pilar | Descrição |
| :--- | :--- |
| **Abstração** | Habilidade de concentrar-se nos aspectos essenciais de um domínio. |
| **Encapsulamento** | Esconder a implementação dos objetos para facilitar a manutenção. |
| **Herança** | Permite que uma classe filha herde e estenda o comportamento de uma classe pai. |
| **Polimorfismo** | Capacidade de um objeto poder ser referenciado de várias formas. |

---

## ‼️ Conceitos Fundamentais POO ‼️

* **Domínio:** A camada de negócio que descreve o problema.
* **Classe:** O "molde" que representa objetos do mundo real.
* **Atributo:** Dados que representam as características da classe.
* **Método:** Ações e comportamentos que o objeto pode realizar.
* **Objeto/Instância:** A materialização de uma classe na memória usando o operador `new`.
