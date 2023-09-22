This is a final project of the Software Tester course at Software Development Academy that I finished.
It was made based on training web banking app GURU99, a spectial web app designed for practising software testing abilities.
In the src directory I'm creating an automated tests for GURU99. Skeleton of the project is based on cucumber-java-skeleton: https://github.com/cucumber/cucumber-java-skeleton

Main objectives for the final project were:
1. Analyze provided  app specification as part of static analysis.
2. Prepare functional test cases in the TestRail for the app and perform them.
3. Generate report from the test in TestRail.
4. Report found bugs to JIRA for specific test case.
5. Record choosen test case in SeleniumIDE.
6. Test case scenario written using Behavior Driven Developement.


    1. Here are some sample bugs found in the specification of the project:
        Format:
        ID numebr, Title, 
        Description
        1. Bugs in formating tabels:
            The whole document is full of bugs in tamples. There is a lot of inconsistency too. For example: on page 2.
        2. Empty paragraphs:
            Some paragraphs are empty, without any content(ergo-file looks like it's unfinished).
        3. Wrong name of paragraph 1. 3:
            There is no acronynms and definitions defined in the file.
        4. Missing title in the tabels 'Description of the modules':
            Title should be presumably ‘Edit Customer’.
        5. Wrong sense of sentence:
            “A manager can add a edit account details for an existing account”
            "A manager can add or edit account details for an existing account."
            There was a grammar mistake.
        6. There is no requirements in paragraph 2. 1:
        7. What is 'Email Id':
            In paragraph 3. 1 there is written ‘Email Id’. What is that? A identifaction number of e-mail? Presumably is should be callen an e-mail.
        8. Amount Higher Limit:
            If we can pick an ‘Amount Lower Limit’, there should be an option to pick ‘Amount Higher Limit’.
        9. Wrong technical requirement regarding characters allowed in Customer ID:
            T1    Customer Id - Customer ID is required 
            T2    Customer Id - Special character are not allowed 
            T3    Customer Id - Characters are not allowed - only special character shouldn’t be aloowed. There only numbers should be allowed.
        10. Mistake in technical requirements:
            T5    Customer Name– Special characters are not allowed 
            If that would be truth, it would means that we cannot use for e.g. dashes in last name.
        11.  Telephone number- special charakters:
            User dosen't have an option to add special charakters like "+" for area code. There should be an option to cover longer, shorter phone numbers for different countries.
        12.  Acronym SRS- no definition:
            There is no explanation what it means.


