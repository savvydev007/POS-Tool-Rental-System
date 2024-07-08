### Summary of "Programming Demonstration"

**Overview:**
- Implement a Java solution for a tool rental application.
- No user interface required.
- Submit via GitHub.

**Specification:**
- Point-of-sale tool rental system for a store.
- Tools: Chainsaw, Ladder, Jackhammer (various brands).
- Rental agreements produced at checkout.
- Daily rental fees vary by tool type.
- Some tools have free rental days on weekends or holidays.
- Discounts can be applied.

**Tools:**
- Chainsaw (Stihl)
- Ladder (Werner)
- Jackhammer (DeWalt, Ridgid)

**Charges:**
- Ladder: $1.99/day (no charge on holidays)
- Chainsaw: $1.49/day (no charge on weekends)
- Jackhammer: $2.99/day (charged on all days)

**Holidays:**
- Independence Day: Observed on closest weekday if on a weekend.
- Labor Day: First Monday in September.

**Checkout:**
- Requires tool code, rental day count, discount percent, and checkout date.
- Throws exceptions for invalid rental day count or discount percent.
- Generates a Rental Agreement with detailed charges and dates.

**Tests:**
- Include JUnit tests covering various scenarios to prove solution correctness.