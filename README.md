# Groovy Null Check Unexpected Behavior

This repository demonstrates a subtle issue related to null checks in Groovy. Groovy's dynamic typing, while offering flexibility, can sometimes lead to unexpected outcomes if not handled carefully.  The `bug.groovy` file contains the problematic code, and `bugSolution.groovy` offers a corrected version.

## Problem

The Groovy code in `bug.groovy` uses a simple null check to handle cases where the input `name` might be null. However, the comparison using `==` might not always behave as expected with null values, potentially leading to unintended execution paths.

## Solution

The `bugSolution.groovy` file shows a safer way to handle null checks using Groovy's safe navigation operator (`?.`) or explicit `null` checks with the `equals()` method for string comparison to avoid unexpected behavior with null inputs. 
