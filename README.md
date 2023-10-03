This is the Final Project of the Software Tester course at Software Development Academy that I finished.
It was made based on the training web banking app GURU99, a special web app designed for practicing software testing abilities.
There is also some API testing made for the purpose of the Final project in SDA using Postman in the Herokuapp testing site.
In the src directory, I'm creating automated tests for GURU99. The skeleton of the project is based on cucumber-java-skeleton: https://github.com/cucumber/cucumber-java-skeleton

The main objectives for the final project were:
1. Analyze provided  app specifications as part of static analysis.
2. Prepare functional test cases in the TestRail for the app and perform them.
3. Generate a report from the test in TestRail.
4. Report found bugs to JIRA for specific test case.
5. Record the chosen test case in SeleniumIDE.
6. Testing API using Postman
7. Test case scenario was written using Behavior Driven Development.


    1. Here are some sample bugs found in the specification of the project:
        Format:
        ID number, Title, 
        Description
        1. Bugs in formating tabels:
            The whole document is full of bugs, especially in tables. There is a lot of inconsistency too. For example: on page 2.
        2. Empty paragraphs:
            Some paragraphs are empty, without any content(ergo-file looks like it's unfinished).
        3. Wrong name of paragraph 1. 3:
            There are no acronyms and definitions defined in the file.
        4. Missing title in the tables 'Description of the modules':
            The title should be presumably ‘Edit Customer’.
        5. Wrong sense of sentence:
            “A manager can add and edit account details for an existing account”
            "A manager can add or edit account details for an existing account."
            There was a grammar mistake.
        6. There are no requirements in paragraph 2. 1:
        7. What is 'Email Id':
            In paragraph 3. 1 there is written ‘Email Id’. What is that? An identification number of e-mail? Presumably it should be called an e-mail.
        8. Amount Higher Limit:
            If we can pick an ‘Amount Lower Limit’, there should be an option to select ‘Amount Higher Limit’.
        9. Wrong technical requirement regarding characters allowed in Customer ID:
            T1    Customer Id - Customer ID is required 
            T2    Customer Id - Special characters are not allowed 
            T3    Customer Id - Characters are not allowed - only special characters shouldn’t be allowed. There only numbers should be allowed.
        10. Mistake in technical requirements:
            T5    Customer Name– Special characters are not allowed 
            If that is the truth, it would mean that we cannot use e.g. dashes in the last name.
        11.  Telephone number- special characters:
            The user dosen't have the option to add special characters like "+" for area code. There should be an option to cover longer, shorter phone numbers for different countries.
        12.  Acronym SRS- no definition:
            There is no explanation of what it means.


