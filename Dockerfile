FROM node:18-alpine

WORKDIR /app

# Copy package.json first
COPY package.json ./

# Check if package-lock.json exists and copy if it does
RUN [ -f package-lock.json ] && cp package-lock.json ./ || echo "package-lock.json not found"

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Expose the application port
EXPOSE 4000

# Start the application in development mode
CMD ["npm", "run", "start:dev"]
