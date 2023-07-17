Feature: Tickets reservation

  Scenario: Successful ticket reservation
    Given flight info:
      | destination | SVO        |
      | departure   | RIX        |
      | discount     | TEST       |
      | adults      | 2          |
      | children    | 3          |
      | luggage     | 2          |
      | flight_date | 14-05-2018 |
      | seat        | 27         |

    And passenger info is:
    #test data in Given
      | first_name | Kristina |
      | last_name  | Tester   |
    #posle tables propusk

    And home page is opened

    When select airports
    Then selected airports appear on the next page

    When fill in passenger registration form
    And request price
    Then passenger name and airports appear
    And price is 500 EUR

    When click Book button
    And select seat
    Then selected seat number appears

    When book selected ticket
    Then successful registration message appears

    When request reservations data
    Then current reservation is in the reservations list
    And all current reservation data is correct