Feature: Creating a new create booking record

Scenario: Creating a new booking request

Given The user is provided with the BaseURI

And The user is provided with the BasePath

When The user is entered with the following details
|firstname   |  lastname     | totalprice  | depositpaid  | checkin  | checkout  | additionalneeds|
|Wilfred     |  Vanspall     | 132         | true         |2022-02-02| 2022-03-03| Dinner         |
|Sam         |  Paul         | 121         | false        |2023-02-02| 2023-03-03| Lunch          |
|Peter       |  Joseph       | 212         | true         |2024-02-02| 2024-04-04| Breakfast      |

Then The user should be able to create a request successfully with status code 200 


