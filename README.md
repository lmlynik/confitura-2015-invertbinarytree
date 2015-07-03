# [Confitura 2015](http://tech.viacom.com/warsawsdc/confitura2015/)
## Invert a Binary Tree

Invert a binary tree.

```
     1
   /   \
  2     3
 / \   / \
4   5 6   7
```
to
```
     1
   /   \
  3     2
 / \   / \
7   6 5   4
```

Data structures:

Scala:
```scala
case class TreeNode(value: Int, left: Option[TreeNode], right: Option[TreeNode])
```

Java:
```java
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
```

Regulamin konkursu znajduje się pod tym [adresem](http://tech.viacom.com/warsawsdc/confitura2015/).

We are hiring! Check out our [open positions](http://tech.viacom.com/careers/).
