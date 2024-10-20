FROM node:18-alpine

WORKDIR /app

# Copy package.json and package-lock.json if available
COPY package.json ./
COPY package-lock.json ./  # Only include if the file exists

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Expose the application port
EXPOSE 4000

# Start the application in development mode
CMD ["npm", "run", "start:dev"]
