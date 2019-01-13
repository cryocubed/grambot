package instaapi;

/**
 * Interface for connecting directly to the native Instagram API.
 */
public interface IInsta {

  /**
   * Logs in an account.
   *
   * @param username to provide to IG servers
   * @param password to provide to IG servers
   */
  void login(String username, String password);

  /**
   * Logs out the current account.
   */
  void logout();

  /**
   * Currently logged in account follows a user based on their id.
   *
   * @param accountId the ID of the specified account.
   */
  void followUser(int accountId);

  /**
   * Currently logged in account likes a post based on its ID.
   *
   * @param postId the ID of the post to follow.
   */
  void likePost(int postId);
}
