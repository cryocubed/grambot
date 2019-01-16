package bots;

/**
 * Manages all the bots including creating them, storing their api, and dispatching commands to
 * specific bots.
 */
public interface IBotManager {

  /**
   * Sets the number of likes to be given by bots.
   */
  void setPostLikes(int id, int amount);

  /**
   * Sets the number of followers to be given by bots.
   */
  void setUserFollowers(int id, int amount);
}
