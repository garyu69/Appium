# Appium SkyVegas

Task to create and run scripts to automate www.skyvegas.com

#Technology

- Appium
- Xcode
- IntelliJ IDEA

#Issues

The part that took the longest for me was getting Appium up and running initially. After installing Appium 1.5.3 I could not get the anything to communicate correctly. On researching I discovered that as I was running Xcode 8 that Appium 1.6 was needed.

Instead I downgraded Xcode to 7.3 and redirected Appium to use this Xcode version instead.

Once everything was running compatible versions I could then successfully launch an iOS simulator and Appium server.

#Tests

First test was to successfully interact with the account bar and provide valid log in details.
This test will fail.

Due to the design of the Sky Vegas site on clicking to log in the account credentials page is provided in a new Frame. After attempting multiple methods I was unable to interact with the required fields. I continued to write the test as I would expect the new lines to work.

While researching for Appium to switch Frame I came across an open issues (https://github.com/appium/appium/issues/5832) which stops this being able to work on iOS.

Second test is just a simple search for games while interacting with the Burger Menu.


#Conclusion

I felt like I spent far to long trying to get Appium initiall up an running. Having never used the software before I ended up having to locate answers and suggesstions to try. Normally in a working situation I would have sought out advice from a Developer or someone who had previous set it up.

Due to taking more time in the set up I haven't been able to spend as much time as I had hoped on writing the tests and debugging the failures.

I am confident given more time I would be able to find a soulution / workaround for the blockers.


#Appium Configuration

Checked: Use Mobile Safari
Force Device: iPhone 5
Platform: 8.3
Xcode 7.3
Server: 127.0.0.1:5555
Java: JDK 1.8
