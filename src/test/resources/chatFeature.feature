Feature: Пращане на съобщения между потребители
  Scenario Outline: При matched/свързани потребители
    Given Имаме празен чат:
    When Имаме потребител изпращател"<userSender>"
    And Имаме потребител получател"<userReceiver>"
    And Получаваме видът връзка която имaт "<isMatched>"
    And Изпратим някакво съобщение "<messageSend>"
    Then Проверяваме дали е получено съобщението "<messageReceived>"
    Examples:
      | userSender | userReceiver | isMatched | messageSend | messageReceived |
      | petya2     | ivan21      | true      | Hi    | delivered       |
      | ivan21     | petya2      | true      | Hi    | delivered       |
      | ivan21    | georgy       | true      | ""          | Няма въведено съобщение|
      | ivan21    | petya2       | true      | ""          | Няма въведено съобщение|
      | ivan21    | petya2       | true      | "30 symbols is way to long for a message"| Съобщението е твърде дълго|
  Scenario Outline: При не свързани потребители
    Given Имаме празен чат:
    When Имаме потребител изпращател"<userSender>"
    And Имаме потребител получател"<userReceiver>"
    And Получаваме видът връзка която имaт "<isMatched>"
    And Изпратим някакво съобщение "<messageSend>"
    Then Проверяваме дали е получено съобщението "<messageReceived>"
    Examples:
      | userSender | userReceiver | isMatched | messageSend | messageReceived |
      | georgy     | petya        | false     | some message | Не сте свързани с този потребител |
      | petya     | georgy        | false     | some message | Не сте свързани с този потребител |
      | georgy     | dimi        | false     | "" | Не сте свързани с този потребител |
      | dimi     | petya        | false     | "30 symbols is way to long for a message" | Не сте свързани с този потребител |
