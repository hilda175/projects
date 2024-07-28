function calculateRectangleArea() {
    let length = parseFloat(prompt("Enter the length of the rectangle:"));
    let breadth = parseFloat(prompt("Enter the breadth of the rectangle:"));
    let area = length * breadth;
    alert("The area of the rectangle is: " + area);
}

function calculateTriangleArea() {
    let base = parseFloat(prompt("Enter the base of the triangle:"));
    let height = parseFloat(prompt("Enter the height of the triangle:"));
    let area = 0.5 * base * height;
    alert("The area of the triangle is: " + area);
}

function calculateCircleArea() {
    let radius = parseFloat(prompt("Enter the radius of the circle:"));
    let area = Math.PI * Math.pow(radius, 2);
    alert("The area of the circle is: " + area);
}

function calculateParallelogramArea() {
    let base = parseFloat(prompt("Enter the base of the parallelogram:"));
    let height = parseFloat(prompt("Enter the height of the parallelogram:"));
    let area = base * height;
    alert("The area of the parallelogram is: " + area);
}

function calculateArea() {
    let shape = prompt("Enter the name of the shape (rectangle, triangle, circle, parallelogram):").toLowerCase();

    switch (shape) {
        case "rectangle":
            calculateRectangleArea();
            break;
        case "triangle":
            calculateTriangleArea();
            break;
        case "circle":
            calculateCircleArea();
            break;
        case "parallelogram":
            calculateParallelogramArea();
            break;
        default:
            alert("Sorry! This shape is not available.");
    }
}

// Driver code
calculateArea();
