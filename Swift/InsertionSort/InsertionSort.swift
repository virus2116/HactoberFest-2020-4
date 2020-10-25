import Foundation

func insertionSort<T: Comparable>(anyArrayInput: [T],comparisonBy: (T, T) -> Bool) -> [T] {
    var items = anyArrayInput

    for index in 1..<items.count {
        let value = items[index]
        var position = index

        while position > 0 && comparisonBy(items[position - 1], value) {
            items[position] = items[position - 1]
            position -= 1
        }

        items[position] = value
    }

    return items
}

var ArrayIntSorted = insertionSort(anyArrayInput: [300, 301, 305, 306, 299], comparisonBy: >)
print("Array Int Sorted: \(ArrayIntSorted)")

var ArrayStringSorted = insertionSort(anyArrayInput: ["B", "C", "Z", "X", "J", "L", "A"], comparisonBy: { $0 > $1 })
print("Array String Sorted: \(ArrayStringSorted)")
