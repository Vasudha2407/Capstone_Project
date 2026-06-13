package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    public static ExtentReports getReport() {

        ExtentSparkReporter reporter =
                new ExtentSparkReporter(
                "reports/AutomationReport.html");

        reporter.config()
                .setReportName(
                "GUI Automation Report");

        ExtentReports extent =
                new ExtentReports();

        extent.attachReporter(reporter);

        return extent;
    }
}