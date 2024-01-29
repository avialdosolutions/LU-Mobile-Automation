# Use the official Appium base image
FROM appium/appium

# Set the working directory in the container
WORKDIR /MobileAutomation

# Copy the Appium setup files from your project
COPY . .

# Expose the Appium server port
EXPOSE 4723

# Start Appium with your specific command when the container runs
CMD ["appium", "server", "--address", "localhost", "--port", "4723", "--use-drivers", "uiautomator2", "--base-path", "/wd/hub"]
