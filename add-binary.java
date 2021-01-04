/*
https://leetcode.com/problems/add-binary/
04/01/21
*/

//Iterate string from back to front.
//Bianry addition is using XOR and AND logic gates.
//Value = B1 ^ B2 ^ Carry (previous);
//Carry = B1 & B2;

//Carry must be initialized with zero;

//xor = a.charAt(i) - '0' ^ b.charAt(i) - '0'^ carry;
//carry = a.charAt(i)- '0' &b.charAt(i)- '0';
