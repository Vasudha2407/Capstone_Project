package tests;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseClass;
import pages.*;
import utils.ExcelUtils;
import utils.ScreenshotUtils;
import utils.ExtentReportManager;

public class GUIAutomationTest extends BaseClass {

    @Test
    public void completeAutomation() throws Exception {

        ExtentReports extent = ExtentReportManager.getReport();
        ExtentTest test = extent.createTest("GUI Automation Test");

        // 🔥 Page Objects
        FormPage form = new FormPage(driver);
        DatePickerPage date = new DatePickerPage(driver);
        AlertPage alert = new AlertPage(driver);
        ActionsPage actions = new ActionsPage(driver);
        UploadPage upload = new UploadPage(driver);
        WindowPage window = new WindowPage(driver);
        TablePage table = new TablePage(driver);
        DynamicButtonPage dynamic = new DynamicButtonPage(driver);
        WikiSearchPage wiki = new WikiSearchPage(driver);
        BrokenLinksPage links = new BrokenLinksPage(driver);
        ScrollingDropdownPage scrollDrop = new ScrollingDropdownPage(driver);
        HiddenAjaxPage ajax =
                new HiddenAjaxPage(driver);

        FooterPage footer =
                new FooterPage(driver);
       

        // 🔥 Step 1 - Form
        System.out.println("Step 1 - Form");


        String filePath ="TestData/data.xlsx";
        String name = ExcelUtils.getCellData(filePath, 1, 0);
        String email = ExcelUtils.getCellData(filePath, 1, 1);
        String phone = ExcelUtils.getCellData(filePath, 1, 2);
        String address = ExcelUtils.getCellData(filePath, 1, 3);

        form.fillForm(name, email, phone, address);

        test.pass("Form Filled Successfully");

        // 🔥 Step 2 - Date
        System.out.println("Step 2 - Date");

        date.selectDatePicker1();
        date.selectDatePicker2();
        date.selectDateRange();

        test.pass("Date Picker Completed");

        // 🔥 Step 3 - Alerts
        System.out.println("Step 3 - Alerts");

        alert.handleSimpleAlert();
        alert.handleConfirmationAlert();
        alert.handlePromptAlert();

        test.pass("Alerts Handled Successfully");

        // 🔥 Step 4 - Actions
        System.out.println("Step 4 - Actions");

        actions.performMouseHover();
        actions.performDoubleClick();
        actions.performDragAndDrop();
        actions.moveSlider();

        test.pass("Actions Completed Successfully");

        // 🔥 Step 5 - Upload
        System.out.println("Step 5 - Upload");

        upload.uploadSingleFile();
        upload.uploadMultipleFiles();

        test.pass("File Upload Completed");

        // 🔥 Step 6 - Window
        System.out.println("Step 6 - Window");

        window.handleNewTab();
        window.handlePopupWindow();

        test.pass("Window Handling Completed");

        // 🔥 Step 7 - Dropdown
        System.out.println("Step 7 - Scrolling Dropdown");

        scrollDrop.selectItem();

        test.pass("Scrolling Dropdown Completed");

        // 🔥 Step 8 - Table
        System.out.println("Step 8 - Table");

        table.readStaticTable();
        table.readDynamicTable();
        table.handlePagination();
        table.selectPaginationCheckboxes();

        test.pass("Table Operations Completed");

        // 🔥 Step 9 - Dynamic Button
        System.out.println("Step 9 - Dynamic Button");

        dynamic.clickStartButton();

        test.pass("Dynamic Button Clicked");

        // 🔥 Step 10 - Wiki
        System.out.println("Step 10 - Wiki");

        wiki.searchWiki();

        test.pass("Wikipedia Search Completed");

        // 🔥 Step 11 - Broken Links
        System.out.println("Step 11 - Broken Links");

        links.verifyBrokenLinks();
        links.clickLaptopLinks();   

        test.pass("Links Handling Completed");
       
        System.out.println(
                "Step 12 - Footer");

        footer.clickAjaxPage();

        System.out.println(
                "Step 13 - Hidden AJAX");

        ajax.enterInput1();

        ajax.showHiddenInput();

        ajax.loadAjaxContent();

        // 🔥 Screenshot
        ScreenshotUtils.captureScreenshot(driver, "FinalOutput");

        test.pass("TEST COMPLETED SUCCESSFULLY");
        

        extent.flush();
    }
}