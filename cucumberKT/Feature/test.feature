Feature: Learn Cucumber Quickly


Background: we are learning
Given work hard
When study hard
Then practise hard

@Smoke
Scenario: Pass Data using  DataTable

Given I set cucumber properly 
|note2|Note9|
|Samsung Note11|Samsung Note14|
When Code is running sucessfully
And No Setup Error blocks me
Then I give KT to Others on pipe and tag and hook
|Bose|Apple|Sony|Huwai|
|Amazon|EBAY|Wallmart|BMW|

@E2E
Scenario: Pass Data using  hardcoded data

Given I am wake
When I want to Learn Cucumber
Then I run Code in Home




@E2E
Scenario Outline: GENERATING SEKELETON

Given I am wake and in call with "<friend>"
When I want to Learn Cucumber
Then I run Code in Home and sharing using  "<application>"

Examples:

|friend|application|
|souni|teamviewer|
|soumi|chrome|




