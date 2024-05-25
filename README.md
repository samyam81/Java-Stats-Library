# Java-Stats-Library

Java-Stats-Library is a comprehensive repository offering a suite of statistical functions and utilities for data analysis and manipulation in Java programming. This library aims to provide developers with a robust toolkit for performing various statistical calculations with ease and efficiency.

## Overview

Java-Stats-Library integrates Lombok for streamlined code generation and leverages generics for flexibility and type safety. It provides a wide range of statistical functions, including mean, median, mode, geometric mean, harmonic mean, sorting algorithms, and more.

## Prerequisites

To use Java-Stats-Library, you need:
- Java Development Kit (JDK) version 8 or higher
- Apache Maven or Gradle for dependency management (optional)

## Installation

To include Java-Stats-Library in your project, add the following dependency to your project's build configuration file (e.g., `pom.xml` for Maven or `build.gradle` for Gradle):

```xml
<!-- Maven -->
<dependency>
    <groupId>com.example</groupId>
    <artifactId>java-stats-library</artifactId>
    <version>1.0.0</version>
</dependency>
```

```groovy
// Gradle
implementation 'com.example:java-stats-library:1.0.0'
```

## Usage

Import the required classes from Java-Stats-Library into your Java files and utilize them to perform statistical calculations on your data.

```java
import com.example.statistics.*;

public class Main {
    public static void main(String[] args) {
        // Example usage of statistical functions
        // ...
    }
}
```

## Features

- Descriptive Statistics: Calculate mean, median, mode, geometric mean, harmonic mean, and more.
- Sorting: Efficient sorting algorithms for sorting numerical arrays.
- Data Manipulation: Analyze datasets, calculate statistical measures, and manipulate data for further analysis.
- Flexibility: Utilizes generics for flexibility, allowing developers to work with different types of numerical data.
- Lombok Integration: Seamless integration with Lombok for reducing boilerplate code and improving code readability.

## File Structure

- "Correlation.java": Defines a generic class `Correlation` with a method `calculateCorrelation` to compute the correlation coefficient between two arrays of numbers, utilizing covariance and variances calculations, and Lombok annotations for getter and setter methods.
- "Covariance.java": Defines a generic class `Covariance` with a method `calculateCovariance` to compute the covariance between two arrays of numbers, utilizing mean calculations and Lombok annotations for getter and setter methods.
- "GeometricMean.java": Defines a generic class `GeometricMean` with a method `calculateGeometricMean` to compute the geometric mean of an array of numbers, utilizing Lombok annotations for getter and setter methods.
- "HarmonicMean.java": Defines a generic class `HarmonicMean` with a method `calculateHarmonicMean` to compute the harmonic mean of an array of numbers, utilizing Lombok annotations for getter and setter methods.
- "LinearRegression.java": Defines a generic class `LinearRegression` with a method `fit` to perform linear regression on two arrays of numbers, computing the slope and intercept of the regression line, utilizing Lombok annotations for getter and setter methods.
- "Mean.java": Defines a generic class `Mean` with a method `calculateMean` to compute the mean of an array of numbers, utilizing Lombok annotations for getter and setter methods, and a constructor to specify the type of numbers to be processed.
- "Median.java": Defines a generic class `Median` with a method `findMedian` to compute the median of an array of numbers, utilizing Lombok annotations for getter and setter methods, and sorting the array to find the median efficiently.
- "MedianHigh.java": Defines a generic class `MedianHigh` with a method `findMedianHigh` to compute the median of an array of numbers, considering the high value for the median in case of an even number of elements, utilizing Lombok annotations for getter and setter methods, and sorting the array to efficiently find the median.
- "MedianLow.java": Defines a generic class `MedianLow` with a method `findMedianLow` to compute the median of an array of numbers, considering the low value for the median in case of an even number of elements, utilizing Lombok annotations for getter and setter methods, and sorting the array to efficiently find the median.
- "Mode.java": Defines a generic class `Mode` with a method `calculateMode` to compute the mode (most frequently occurring value) of an array of numbers, utilizing Lombok annotations for getter and setter methods, and a HashMap to store the frequency of each element.
- "Multimode.java": Defines a generic class `Multimode` with a method `calculateMultimode` to compute the multimode (values that occur most frequently) of an array of numbers, utilizing Lombok annotations for getter and setter methods, and a HashMap to store the frequency of each element.
- "Quantiles.java": Defines a generic class `Quantiles` with a method `getQuantiles` to compute the quantiles (values that divide a dataset into equally sized intervals) of an array of numbers, utilizing Lombok annotations for getter and setter methods, and sorting the array to efficiently find the quantiles.
- "Sorting.java": This Java class provides generic implementations of two sorting algorithms: insertion sort and quick sort. The constructor determines which algorithm to use based on the size of the input array, and the class provides private methods for sorting and partitioning.

## Dependencies

Java-Stats-Library has the following dependencies:
- Lombok: A Java library that helps reduce boilerplate code by providing annotations such as `@Getter`, `@Setter`, and `@NoArgsConstructor`.

## Acknowledgments

Java-Stats-Library acknowledges the contributions of the Lombok project and the open-source community for their continuous support and feedback.
