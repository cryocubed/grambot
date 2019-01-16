package api;

/**
 * A simplified adapter for using the Google Sheets API.
 */
public interface IGSheetsAdapter {

  /**
   * Reads the data from a specified cell.
   */
  static String readCell(String sheet, int row, int col) {
    throw new RuntimeException("not yet implemented");
  }

  /**
   * Writes data to a specified cell.
   */
  static void writeCell(String sheet, int row, int col, String data) {
    throw new RuntimeException("not yet implemented");
  }

}
