package com.interview.tasks;

import java.util.List;

public interface ArrayProcessor {

    /**
     * Modifies the input list so that each element is replaced by the product of all other elements in the list.
     * The input list must contain more than one element.
     *
     * <p>For example, given an input list with three elements: {@code {x1, x2, x3}}, the output will be:
     * {@code {x2 * x3, x1 * x3, x1 * x2}}.</p>
     *
     * <p>Example usage:</p>
     * <pre>
     * {@code
     * input:  {1, 2, 3}
     * output: {2 * 3, 1 * 3, 1 * 2} -> {6, 3, 2}
     *
     * input:  {4, 5, 6, 7}
     * output: {5 * 6 * 7, 4 * 6 * 7, 4 * 5 * 7, 4 * 5 * 6} -> {210, 168, 140, 120}
     * }
     * </pre>
     *
     * <p>Note:</p>
     * <ul>
     * <li>Consider the complexity of the solution when implementing this method.</li>
     * <li>Use Java Streams if possible to achieve a more concise and readable solution.</li>
     * </ul>
     *
     * @param numbers the input list to be modified
     * @return a list where each element is the product of all other elements in the input list
     * @throws IllegalArgumentException if the input list contains fewer than two elements
     */
    List<Integer> resolve(List<Integer> numbers);
}
