Feature: Order product
  Do a simple order.

  Scenario: Search for cheese
    * configure driver = { type: 'chromedriver', port: 9515, executable: '/home/markus/Git/java-examples/karate/lib/chromedriver' }
    Given driver 'http://localhost:8080/product?sku=FOO-0815'
    When click('button[name=addToCart]')
    And driver 'http://localhost:8080/cart'
    And click('button[name=orderCart]')
    Then match text('span.orderConfirmation') contains 'Order confirmation numer'
    * def orderConfirmationNumber = text('span.orderConfirmationNumber')
    Given url 'http://localhost:8080/order?ordConfNo=' + orderConfirmationNumber
    When method get
    Then status 200
    And match response.status == “NEW”
