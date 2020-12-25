# Week 7 Task Description:

# Task 7.1 Description:

Write methods that will:<br />
7.1a: Get the 99th element from the console args and handle an exception thrown.<br />
7.1b: Search for an index of a letter “X” in a word “GoGoJava” and make a substring based on the index of “X” till the end of the word.<br />
7.1c: Add into the code from slide “Handle or declare – handle (2)” throw new IOException() inside try/catch/finally blocks one by one (first in try, then in catch, then in finally). Catch an exception thrown in finally block.<br />
7.1d: Create an object of a BufferedReaded class and pass another object of FileReaderClass with parameter in constructor “Dog.class”. Handle or declare an exception new BufferedReader(new FileReader("Car.java")).


# Task 7.2 Description:<br />
- Create three methods that will throw checked and unchecked exceptions. Google for out-of-box Java exceptions of both types.<br />
- For each method catch an exception thrown and use different approaches to show the exception details – message, stack etc.<br />


# Task 7.3 Description:<br />
- Refactor ATM system (Week 4*) to throw various exceptions in case the business logic is not satisfied:<br />
    - User tries to withdraw money that is not available on the account;<br />
    - Serviceman tries to install outdated software;<br />

- Create a custom exception and use it instead of standard Java for the situations above. Explain the choice of checked/unchecked exception.<br />
- Code the scenario when the exception is thrown in one class, but is handled in another (ie, thrown in CreditCard but handled in AtmService).<br />

*Week 4 - ATM description:<br />
- Create a Java representation of an ATM (Automatic Teller Machine). Determine and implement:<br />
1. crucial and auxiliary properties;<br />
2. several methods that will allow:<br />
    - customers to use (conventional operations) an instance of ATM. Note: think over the behind the stage logic for ATM – overdraft for an account, too big sum to withdraw, etc;<br />
    - bank staff to install software updates and refill the ATM with notes;<br />

- Create an overloaded constructors for ATM. It will allow you to create instances of ATM with or without auxiliary properties.<br />
- Create an array that will represent ATM network of a particular bank.<br />
- Modify ATM class, so you can track the total number of ATMs created. Hint: Use static variable.<br />
- Create an independent class that will represent the Software installed on the ATM. This class should describe the version, when the last update took place, and who triggered it, etc.<br />
- Change ATM class so it will include Software instance.<br />
- Modify ATM constructors and methods used by staff to update the Software for a particular ATM instance. When this method is invoked, use Thread.sleep(2000) method (note that is it static method) to pause the thread for 2 sec and simulate the software update.<br />

Any Software update potentially can break the ATM. Thus, you need to design the recovery method.<br />
- Create a static method (since it is independent of ATM and Software) that will:<br />
1. Be run after the Software update;<br />
2. Check if the new Software works properly;<br />
3. If the new Software is corrupted, this method will restore the previous Software for this ATM.
