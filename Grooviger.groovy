class Grooviger {

    static void main(String[] args) {
        //println 'Hello, Groovy!'

        // Variables are dynamically typed
        def age = 'Dog';
        age = 60;
        // Integer math operations
        println("5 + 4 = " + (5 + 4));
        println("5 - 4 = " + (5 - 4));
        println("5 * 4 = " + (5 * 4));
        println("5 / 4 = " + (5.intdiv(4)));
        println("5 % 4 = " + (5 % 4));
        println("");
        // Floating point math operations
        println("5.2 + 4.4 = " + (5.2.plus(4.4)));
        println("5.2 - 4.4 = " + (5.2.minus(4.4)));
        println("5.2 * 4.4 = " + (5.2.multiply(4.4)));
        println("5.2 / 4.4 = " + (5.2 / 4.4));
        println("");
        // Pre/Post increment
        println("age++ = " + (age++)); // 61
        println("++age = " + (++age));
        println("age-- = " + (age--)); // 61
        println("--age = " + (--age));

    }

}
