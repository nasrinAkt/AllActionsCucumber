Feature:
@tag
Scenario:Verify Notice link display in home page 
Given Open school application
Then Verify Notice link display in home page 



@tag1
Scenario: Verify Notice page display
Given Open school application
Then Click Notice link
Then Verify Notice page display


@tag2
Scenario: Verify Notice Board display in Notice page
Given Open school application
Then Click Notice Link
Then Verify Notice Board display in Notice page


@tag3
Scenario: Verify 3 information(TITLE, DATE, VIEW)display in Notice Board

Given Open school application
Then Click notice Link
Then Verify 3 information(TITLE, DATE, VIEW)display in Notice Board

@tag4
Scenario: Verify Notice details display when click view
Given Open school application
Then Click notice link 
Then Click view
Then Verify Notice details display when click view








