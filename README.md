# A/C Unit

<p align="center">
<img src="http://cdn.cnn.com/cnnnext/dam/assets/191127155431-gettyimages-1002667402-super-tease.jpg" height="80%" width="80%"/>
<br />

Working for a utility company that provides electrical service to the local region. The company faces a serious problem: at times of high heat, high demand for electricity for air conditioning at times overwhelms available capacity, leading to power outages.

To avoid this, the company has offered customers the option to have their air conditioner configured with remote control technology, and allow the company to shut down the A/C unit for an hour. In return, the customer receives a cost savings on the monthly bill for each hour the company turns off the A/C unit.

Develop a prototype that:

- For each demand hour: determines how many units need to be turned off, and tracks which units you have turned off
- Tracks credits for each hour an A/C unit is turned off, so that the corresponding customer can be credited at the end of the billing cycle

The program should do the following:

- Allow the user to enter the number of participating A/C units and the number of expected hours of peak demand
- Create and manage a set of data structures for keeping track of the status of A/C unit, and the number of credits earned for shut-off hours
- For each hour of peak demand:
  - Use random number generator to select the number of units the company needs to shut down to meet demand
  - Mark the status of turned-off units as “off” (note: for simplicity, always turn off units starting with unit 0 and going up)
  - Add a credit for each hour an A/C unit is shut down
- Print, for each hour of peak demand:
  - Number of unit-shutdowns needed to meet demand
  - The on/off status of each unit during the demand hour, and the total number of credits earned
- Ensure that each A/C unit is turned on at the end of each peak-demand hour
