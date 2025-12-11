# Sorting Algorithms Comparison

A comprehensive Java implementation and performance comparison of various sorting algorithms including QuickSort, MergeSort, and RadixSort.

## 📋 Features

- **QuickSort**: Optimized implementation with median-of-three pivot selection
- **MergeSort**: Efficient merge sort with reduced space complexity
- **RadixSort**: Most Significant Figure (MSF) radix sort implementation
- **Performance Testing**: Built-in benchmarking tools to compare algorithm performance
- **Utility Methods**: Array shuffling, validation, and helper functions

## 🚀 Algorithms Implemented

### 1. QuickSort
- Uses median-of-three pivot selection for better performance
- Manual sorting for small subarrays (size ≤ 3)
- Average time complexity: O(n log n)
- Space complexity: O(log n)

### 2. MergeSort
- Efficient implementation with reusable temporary array
- Stable sorting algorithm
- Time complexity: O(n log n)
- Space complexity: O(n)

### 3. RadixSort
- Most Significant Figure (MSF) approach
- Non-comparison based sorting
- Time complexity: O(d × n) where d is the number of digits
- Space complexity: O(n + k)

## 📊 Performance Testing

The project includes a comprehensive testing framework that:
- Runs multiple iterations for statistical accuracy
- Calculates arithmetic mean of execution times
- Tests with partially shuffled arrays (25% disorder)
- Verifies sorting correctness after each run

## 🛠️ How to Build and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Ant (for building with build.xml)

### Build the Project
```bash
ant compile
```

### Run the Program
```bash
ant run
```

Or compile and run manually:
```bash
javac -d build/classes src/*.java
java -cp build/classes sorting.Sorting
```

## 📁 Project Structure

```
sorting/
├── src/
│   ├── Sorting.java      # Main class with testing framework
│   ├── QuickSort.java    # QuickSort implementation
│   ├── MergeSort.java    # MergeSort implementation
│   ├── RadixSort.java    # RadixSort implementation
│   └── Methods.java      # Utility methods
├── build/
├── nbproject/            # NetBeans project files
├── build.xml             # Ant build configuration
└── README.md
```

## 💡 Usage Example

```java
// Create and fill an array
int[] arr = new int[1000];
Methods.fillArray(arr);

// Shuffle the array
Methods.shuffleArray(arr, arr.length / 4);

// Sort using QuickSort
QuickSort.QuickSort(arr);

// Verify the array is sorted
boolean isSorted = Methods.isSorted(arr);
```

## 📈 Performance Results

The testing method runs benchmarks on arrays of different sizes and measures:
- Execution time in milliseconds
- Number of swaps performed
- Arithmetic mean across multiple runs

## 🔧 Key Classes and Methods

### Methods.java
- `isSorted(int[] arr)` - Verifies if array is sorted
- `fillArray(int[] arr)` - Fills array with sequential values
- `shuffleArray(int[] arr, int n)` - Randomly shuffles n elements

### QuickSort.java
- `QuickSort(int[] arr)` - Main sorting method
- `medianOfThree()` - Pivot selection strategy
- `partition()` - Array partitioning

### MergeSort.java
- `mergeSort(int[] arr)` - Main sorting method
- `merge()` - Merges sorted subarrays

### RadixSort.java
- `MSFRadixSort(int[] arr)` - Most Significant Figure radix sort
- `sortDigitByDigit()` - Digit-wise sorting

## 🎯 Future Enhancements

- [ ] Add HeapSort implementation
- [ ] Implement TimSort
- [ ] Add visualization of sorting process
- [ ] Include more detailed performance metrics (comparisons, swaps)
- [ ] Add unit tests with JUnit
- [ ] Create GUI for interactive comparison

## 📝 License

This project is open source and available under the MIT License.

## 👤 Author

Created as a demonstration of sorting algorithm implementations and performance analysis.

## 🤝 Contributing

Contributions, issues, and feature requests are welcome!

---

⭐ If you find this project useful, please consider giving it a star!
