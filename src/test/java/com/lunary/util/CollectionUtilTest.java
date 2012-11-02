
package com.lunary.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;

import org.junit.Test;

public class CollectionUtilTest {

  @Test
  public void isEmpty() {
    
    assertTrue("null collection is empty", CollectionUtil.isEmpty(null));
    assertTrue("empty List is empty", CollectionUtil.isEmpty(new ArrayList<Object>()));
  }
  
  @Test
  public void isNotEmpty() {
    
    List<Object> list = new ArrayList<Object>();
    list.add(new Object());
    assertFalse("collection with one element", CollectionUtil.isEmpty(list));
    assertTrue("collection with one element", CollectionUtil.isEmpty(list));
  }
  
  @Test
  public void fail() {
    Assert.fail("this is intended failure");
  }
}
