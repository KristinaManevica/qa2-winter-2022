Feature: Weather forecast

  Scenario: Weather forecast for specific city
    Given city ID is: 52347
    When user requests weather forecast
    Then coordinates are:
# map: key| value
      | latitude  | 39.31 |
      | longitude | -74.5 |

    And timezone information is:
      | timezone        | America/New_York |
      | timezone_offset | -18000           |

    And current weather data is:
      | dt      | 1646318698 |
      | sunrise | 1646306882 |
      | sunset  | 1646347929 |
      | temp    | 282.21     |

    #eto odin objekt, no esli estj spisok objektov to mozhno dublirovatj i ukazivatj porjadkovij nomer v stepe
    And alert Nr. 1 received:
      | sender_name | NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)                                                                                                                                                                                                                                                                                                                                                                                                                                   |
      | event       | Small Craft Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | start       | 1684952747                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | end         | 1684988747                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | description | ...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS AFTERNOON TO 3 AM EST FRIDAY...* WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas 3 to 5 ft expected. * WHERE...Coastal waters from Little Egg Inlet to Great Egg Inlet NJ out 20 nm, Coastal waters from Great Egg Inlet to Cape May NJ out 20 nm and Coastal waters from Manasquan Inlet to Little Egg Inlet NJ out 20 nm. * WHEN...From 5 PM this afternoon to 3 AM EST Friday. * IMPACTS...Conditions will be hazardous to small craft. |

    And alert Nr. 2 received:
      | sender_name | NWS Philadelphia - Mount Holly (New Jersey, Delaware, Southeastern Pennsylvania)                                                                                                                                                                                                                                                                                                                                                                                                                                   |
      | event       | Small Craft Advisory                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |
      | start       | 1646344800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | end         | 1646380800                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
      | description | ...SMALL CRAFT ADVISORY REMAINS IN EFFECT FROM 5 PM THIS AFTERNOON TO 3 AM EST FRIDAY...* WHAT...North winds 15 to 20 kt with gusts up to 25 kt and seas 3 to 5 ft expected. * WHERE...Coastal waters from Little Egg Inlet to Great Egg Inlet NJ out 20 nm, Coastal waters from Great Egg Inlet to Cape May NJ out 20 nm and Coastal waters from Manasquan Inlet to Little Egg Inlet NJ out 20 nm. * WHEN...From 5 PM this afternoon to 3 AM EST Friday. * IMPACTS...Conditions will be hazardous to small craft. |
    #spisok vinosim otdeljnim shagom
    #spisok vsegda toljko znachenija i poetomu s boljwoj bukvi
    And tags for an alert Nr. 1 are:
      | Sunny  |
      | Clouds |





#-> ctrl+/  ; dlja stringa ne nado "" v map

