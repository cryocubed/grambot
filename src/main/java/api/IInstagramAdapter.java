package api;

/**
 * Interface adapter for connecting directly to the native Instagram API.
 */
public interface IInstagramAdapter {

  /**
   * Logs in an account.
   *
   * @param username to provide to IG servers
   * @param password to provide to IG servers
   */
  static void login(String username, String password) {
    throw new RuntimeException("not yet implemented");
  }

  /**
   * Logs out the current account.
   */
  static void logout() {
    throw new RuntimeException("not yet implemented");
  }

  /**
   * Currently logged in account follows a user based on their ID.
   *
   * @param accountId the ID of the specified account.
   */
  static void followUser(int accountId) {
    throw new RuntimeException("not yet implemented");
  }

  /**
   * Currently logged in account likes a post based on its ID.
   *
   * @param postId the ID of the post to follow.
   */
  static void likePost(int postId) {

  }
}
