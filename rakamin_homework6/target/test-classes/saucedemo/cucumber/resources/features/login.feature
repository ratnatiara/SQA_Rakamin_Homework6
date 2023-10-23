Feature: Login Halaman

Scenario: Success Login
        Given Halaman Login saucedemo
        When input username
        And input password
        And User menekan tombol login
        Then User sukses login dan redirect ke halaman utama

Scenario: Failed Login
        Given Halaman Login saucedemo
        When input username
        And input invalid password
        And User menekan tombol login
        Then User get error message
