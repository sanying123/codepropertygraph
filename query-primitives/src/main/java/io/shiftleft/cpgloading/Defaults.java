package io.shiftleft.cpgloading;

public class Defaults {

  /** percentage of heap used for caching elements in tinkergraph
   * everything that doesn't fit into the cache will be serialized to disk
   * there needs to be sufficient space for everything else. currently, this value is a good sweet spot */
  public static final float DEFAULT_CACHE_HEAP_PERCENTAGE = 30f;

}
