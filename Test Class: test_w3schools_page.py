import pytest
from selenium import webdriver
from webdriver_manager.chrome import ChromeDriverManager
from page_objects import W3SchoolsPage


@pytest.fixture(scope="module")
def setup():
    # Initialize Chrome WebDriver using webdriver_manager
    driver = webdriver.Chrome(ChromeDriverManager().install())
    yield driver
    driver.quit()


def test_w3schools_logo_presence(setup):
    # Create the W3SchoolsPage object using the driver from the fixture
    w3schools_page = W3SchoolsPage(setup)

    # Open the W3Schools website
    w3schools_page.open("https://www.w3schools.com/")

    # Verify the presence of the logo on the page
    assert w3schools_page.is_logo_present(), "W3Schools logo is not present on the page."
