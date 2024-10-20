# Use the base Node image
FROM node:18-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy package.json and package-lock.json (if available)
COPY package.json ./
COPY package-lock.json ./  # Include this if you have a package-lock.json file

# Install dependencies
RUN npm install

# Copy the rest of your application code
COPY . .

# Expose the application port
EXPOSE 4000

# Start the application in development mode
CMD ["npm", "run", "start:dev"]  # Change to your dev command if it's different
